package com.spring.util;

import java.io.File;  
import java.util.Arrays;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.UUID;  
   
import javax.servlet.http.HttpServletRequest;  
   
import org.springframework.util.FileCopyUtils;  
import org.springframework.web.multipart.MultipartFile;  
import org.springframework.web.multipart.MultipartHttpServletRequest;  

public class MedicationUploadTool {

	/**
	 * @descrption 根据HttpServletRequest对象获取MultipartFile集合
	 * @author xdwang
	 * @create 2012-11-19下午5:11:41
	 * @param request
	 * @param maxLength
	 *            <strong>文件</strong>最大限制
	 * @param allowExtName
	 *            不允许上传的<strong>文件</strong>扩展名
	 * @return MultipartFile集合
	 */
	public static List<MultipartFile> getFileSet(HttpServletRequest request, long maxLength, String[] allowExtName) {
		MultipartHttpServletRequest multipartRequest = null;
		try {
			multipartRequest = (MultipartHttpServletRequest) request;
		} catch (Exception e) {
			return new LinkedList<MultipartFile>();
		}

		List<MultipartFile> files = new LinkedList<MultipartFile>();
		files = multipartRequest.getFiles("attach");
		// 移除不符合条件的
		for (int i = 0; i < files.size(); i++) {
			if (!validateFile(files.get(i), maxLength, allowExtName)) {
				files.remove(files.get(i));
				if (files.size() == 0) {
					return files;
				}
			}
		}
		return files;
	}

	/**
	 * @descrption 保存<strong>文件</strong>
	 * @author xdwang
	 * @create 2012-11-19下午4:17:36
	 * @param file
	 *            MultipartFile对象
	 * @param path
	 *            保存路径，如“D:\\File\\”
	 * @return 保存的全路径 如“D:\\File\\2345678.txt”
	 * @throws Exception
	 *             <strong>文件</strong>保存失败
	 */
	public static String uploadFile(MultipartFile file, String path) throws Exception {

		String filename = file.getOriginalFilename();
		String extName = filename.substring(filename.lastIndexOf(".")).toLowerCase();
		String lastFileName = UUID.randomUUID().toString() + extName;
		if (!path.endsWith(File.separator)) {
			path = path + File.separator;
		}
		File temp = new File(path);
		if (!temp.isDirectory()) {
			temp.mkdir();
		}
		// 图片存储的全路径
		String fileFullPath = path + lastFileName;
		FileCopyUtils.copy(file.getBytes(), new File(fileFullPath));
		return fileFullPath;
	}

	/**
	 * @descrption 验证<strong>文件</strong>格式，这里主要验证后缀名
	 * @author xdwang
	 * @create 2012-11-19下午4:08:12
	 * @param file
	 *            MultipartFile对象
	 * @param maxLength
	 *            <strong>文件</strong>最大限制
	 * @param allowExtName
	 *            不允许上传的<strong>文件</strong>扩展名
	 * @return <strong>文件</strong>格式是否合法
	 */
	private static boolean validateFile(MultipartFile file, long maxLength, String[] allowExtName) {
		if (file.getSize() < 0 || file.getSize() > maxLength)
			return false;
		String filename = file.getOriginalFilename();

		// 处理不选择<strong>文件</strong>点击上传时，也会有MultipartFile对象，在此进行过滤
		if (filename == "") {
			return false;
		}
		String extName = filename.substring(filename.lastIndexOf(".")).toLowerCase();
		if (allowExtName == null || allowExtName.length == 0 || Arrays.binarySearch(allowExtName, extName) != -1) {
			return true;
		} else {
			return false;
		}
	}

}
