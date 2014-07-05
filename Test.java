package com.career.bid.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Test {
	public static final int WHITE = -1315861;
	public static final int RED = -65536;
	public static final int[][] ZERO = new int[10][10];
	public static final int[][] ONE = new int[10][10];
	public static final int[][] TWO = new int[10][10];
	public static final int[][] THREE = new int[10][10];
	public static final int[][] FOUR = new int[10][10];
	public static final int[][] FIVE = new int[10][10];
	public static final int[][] SIX = new int[10][10];
	public static final int[][] SEVEN = new int[10][10];
	public static final int[][] EIGHT = new int[10][10];
	public static final int[][] NINE = new int[10][10];
	public static List<int[][]> list;
	static {
		list = new ArrayList<int[][]>();
		list.add(ZERO);
		list.add(ONE);
		list.add(TWO);
		list.add(THREE);
		list.add(FOUR);
		list.add(FIVE);
		list.add(SIX);
		list.add(SEVEN);
		list.add(EIGHT);
		list.add(NINE);
		for (int[][] is : list) {
			for (int[] is2 : is) {
				for (int i = 0; i < is2.length; i++) {
					is2[i] = WHITE;
				}
			}
		}
		System.out.println();
	}
	static {
		for (int i = 0; i < ZERO.length; i++) {
			for (int j = 0; j < ZERO[i].length; j++) {
				ZERO[0][3] = RED;
				ZERO[0][4] = RED;
				ZERO[0][5] = RED;
				ZERO[0][6] = RED;
				;
				ZERO[1][2] = RED;
				ZERO[1][7] = RED;
				;
				ZERO[2][2] = RED;
				ZERO[2][7] = RED;
				;
				ZERO[3][2] = RED;
				ZERO[3][7] = RED;
				;
				ZERO[4][2] = RED;
				ZERO[4][7] = RED;
				;
				ZERO[5][2] = RED;
				ZERO[5][7] = RED;
				;
				ZERO[6][2] = RED;
				ZERO[6][7] = RED;
				;
				ZERO[7][2] = RED;
				ZERO[7][7] = RED;
				;
				ZERO[8][2] = RED;
				ZERO[8][7] = RED;
				;
				ZERO[9][3] = RED;
				ZERO[9][4] = RED;
				ZERO[9][5] = RED;
				ZERO[9][6] = RED;

			}
		}

	}

	static {
		for (int i = 0; i < ONE.length; i++) {
			for (int j = 0; j < ONE[i].length; j++) {
				ONE[0][4] = RED;
				;
				ONE[1][2] = RED;
				ONE[1][3] = RED;
				ONE[1][4] = RED;
				;
				ONE[2][4] = RED;
				;
				ONE[3][4] = RED;
				;
				ONE[4][4] = RED;
				;
				ONE[5][4] = RED;
				;
				ONE[6][4] = RED;
				;
				ONE[7][4] = RED;
				;
				ONE[8][4] = RED;
				;
				ONE[9][2] = RED;
				ONE[9][3] = RED;
				ONE[9][4] = RED;
				ONE[9][5] = RED;
				ONE[9][6] = RED;

			}
		}
	}
	static {
		for (int i = 0; i < TWO.length; i++) {
			for (int j = 0; j < TWO[i].length; j++) {
				TWO[0][3] = RED;
				TWO[0][4] = RED;
				TWO[0][5] = RED;
				TWO[0][6] = RED;
				;
				TWO[1][2] = RED;
				TWO[1][7] = RED;
				;
				TWO[2][2] = RED;
				TWO[2][7] = RED;
				;
				TWO[3][7] = RED;
				;
				TWO[4][6] = RED;
				;
				TWO[5][5] = RED;
				;
				TWO[6][4] = RED;
				;
				TWO[7][3] = RED;
				;
				TWO[8][2] = RED;
				;
				TWO[9][2] = RED;
				TWO[9][3] = RED;
				TWO[9][4] = RED;
				TWO[9][5] = RED;
				TWO[9][6] = RED;
				TWO[9][7] = RED;

			}
		}

	}
	static {
		for (int i = 0; i < THREE.length; i++) {
			for (int j = 0; j < THREE[i].length; j++) {
				THREE[0][3] = RED;
				THREE[0][4] = RED;
				THREE[0][5] = RED;
				THREE[0][6] = RED;
				;
				THREE[1][2] = RED;
				THREE[1][7] = RED;
				;
				THREE[2][2] = RED;
				THREE[2][7] = RED;
				;
				THREE[3][6] = RED;
				;
				THREE[4][4] = RED;
				THREE[4][5] = RED;
				;
				THREE[5][6] = RED;
				;
				THREE[6][7] = RED;
				;
				THREE[7][2] = RED;
				THREE[7][7] = RED;
				;
				THREE[8][2] = RED;
				THREE[8][7] = RED;
				;
				THREE[9][3] = RED;
				THREE[9][4] = RED;
				THREE[9][5] = RED;
				THREE[9][6] = RED;

			}
		}

	}
	static {
		for (int i = 0; i < FOUR.length; i++) {
			for (int j = 0; j < FOUR[i].length; j++) {
				FOUR[0][5] = RED;
				;
				FOUR[1][5] = RED;
				;
				FOUR[2][4] = RED;
				FOUR[2][5] = RED;
				;
				FOUR[3][3] = RED;
				FOUR[3][5] = RED;
				;
				FOUR[4][2] = RED;
				FOUR[4][5] = RED;
				;
				FOUR[5][2] = RED;
				FOUR[5][5] = RED;
				;
				FOUR[6][2] = RED;
				FOUR[6][3] = RED;
				FOUR[6][4] = RED;
				FOUR[6][5] = RED;
				FOUR[6][6] = RED;
				FOUR[6][7] = RED;
				;
				FOUR[7][5] = RED;
				;
				FOUR[8][5] = RED;
				;
				FOUR[9][4] = RED;
				FOUR[9][5] = RED;
				FOUR[9][6] = RED;

			}
		}

	}
	static {
		for (int i = 0; i < FIVE.length; i++) {
			for (int j = 0; j < FIVE[i].length; j++) {
				FIVE[0][2] = RED;
				FIVE[0][3] = RED;
				FIVE[0][4] = RED;
				FIVE[0][5] = RED;
				FIVE[0][6] = RED;
				FIVE[0][7] = RED;
				;
				FIVE[1][2] = RED;
				;
				FIVE[2][2] = RED;
				;
				FIVE[3][2] = RED;
				FIVE[3][4] = RED;
				FIVE[3][5] = RED;
				FIVE[3][6] = RED;
				;
				FIVE[4][2] = RED;
				FIVE[4][3] = RED;
				FIVE[4][7] = RED;
				;
				FIVE[5][7] = RED;
				;
				FIVE[6][7] = RED;
				;
				FIVE[7][2] = RED;
				FIVE[7][7] = RED;
				;
				FIVE[8][2] = RED;
				FIVE[8][7] = RED;
				;
				FIVE[9][3] = RED;
				FIVE[9][4] = RED;
				FIVE[9][5] = RED;
				FIVE[9][6] = RED;

			}
		}

	}
	static {
		for (int i = 0; i < SIX.length; i++) {
			for (int j = 0; j < SIX[i].length; j++) {
				SIX[0][4] = RED;
				SIX[0][5] = RED;
				SIX[0][6] = RED;
				;
				SIX[1][3] = RED;
				;
				SIX[2][2] = RED;
				;
				SIX[3][2] = RED;
				;
				SIX[4][2] = RED;
				SIX[4][4] = RED;
				SIX[4][5] = RED;
				SIX[4][6] = RED;
				;
				SIX[5][2] = RED;
				SIX[5][3] = RED;
				SIX[5][6] = RED;
				SIX[5][7] = RED;
				;
				SIX[6][2] = RED;
				SIX[6][7] = RED;
				;
				SIX[7][2] = RED;
				SIX[7][7] = RED;
				;
				SIX[8][2] = RED;
				SIX[8][7] = RED;
				;
				SIX[9][3] = RED;
				SIX[9][4] = RED;
				SIX[9][5] = RED;
				SIX[9][6] = RED;

			}
		}

	}
	static {
		for (int i = 0; i < SEVEN.length; i++) {
			for (int j = 0; j < SEVEN[i].length; j++) {
				SEVEN[0][2] = RED;
				SEVEN[0][3] = RED;
				SEVEN[0][4] = RED;
				SEVEN[0][5] = RED;
				SEVEN[0][6] = RED;
				SEVEN[0][7] = RED;
				;
				SEVEN[1][2] = RED;
				SEVEN[1][7] = RED;
				;
				SEVEN[2][2] = RED;
				SEVEN[2][7] = RED;
				;
				SEVEN[3][6] = RED;
				SEVEN[3][7] = RED;
				;
				SEVEN[4][6] = RED;
				;
				SEVEN[5][5] = RED;
				;
				SEVEN[6][4] = RED;
				;
				SEVEN[7][4] = RED;
				;
				SEVEN[8][4] = RED;
				;
				SEVEN[9][4] = RED;
			}
		}

	}
	static {
		for (int i = 0; i < EIGHT.length; i++) {
			for (int j = 0; j < EIGHT[i].length; j++) {
				EIGHT[0][3] = RED;
				EIGHT[0][4] = RED;
				EIGHT[0][5] = RED;
				EIGHT[0][6] = RED;
				;
				EIGHT[1][2] = RED;
				EIGHT[1][7] = RED;
				;
				EIGHT[2][2] = RED;
				EIGHT[2][7] = RED;
				;
				EIGHT[3][2] = RED;
				EIGHT[3][7] = RED;
				;
				EIGHT[4][3] = RED;
				EIGHT[4][4] = RED;
				EIGHT[4][5] = RED;
				EIGHT[4][6] = RED;
				;
				EIGHT[5][2] = RED;
				EIGHT[5][7] = RED;
				;
				EIGHT[6][2] = RED;
				EIGHT[6][7] = RED;
				;
				EIGHT[7][2] = RED;
				EIGHT[7][7] = RED;
				;
				EIGHT[8][2] = RED;
				EIGHT[8][7] = RED;
				;
				EIGHT[9][3] = RED;
				EIGHT[9][4] = RED;
				EIGHT[9][5] = RED;
				EIGHT[9][6] = RED;
			}
		}

	}
	static {
		for (int i = 0; i < NINE.length; i++) {
			for (int j = 0; j < NINE[i].length; j++) {
				NINE[0][3] = RED;
				NINE[0][4] = RED;
				NINE[0][5] = RED;
				NINE[0][6] = RED;
				;
				NINE[1][2] = RED;
				NINE[1][7] = RED;
				;
				NINE[2][2] = RED;
				NINE[2][7] = RED;
				;
				NINE[3][2] = RED;
				NINE[3][7] = RED;
				;
				NINE[4][2] = RED;
				NINE[4][6] = RED;
				NINE[4][7] = RED;
				;
				NINE[5][3] = RED;
				NINE[5][4] = RED;
				NINE[5][5] = RED;
				NINE[5][7] = RED;
				;
				NINE[6][7] = RED;
				;
				NINE[7][7] = RED;
				;
				NINE[8][6] = RED;
				;
				NINE[9][3] = RED;
				NINE[9][4] = RED;
				NINE[9][5] = RED;
			}
		}

	}

	public static void download(String urlString, String filename, String savePath) throws Exception {
		URL url = new URL(urlString);
		URLConnection con = url.openConnection();
		con.setConnectTimeout(5 * 1000);
		InputStream is = con.getInputStream();
		byte[] bs = new byte[1024];
		int len;
		File sf = new File(savePath);
		if (!sf.exists()) {
			sf.mkdirs();
		}
		OutputStream os = new FileOutputStream(sf.getPath() + File.separator + filename);
		while ((len = is.read(bs)) != -1) {
			os.write(bs, 0, len);
		}
		os.close();
		is.close();
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String userDir = System.getProperty("user.dir") + File.separator;
		String savePath = userDir + "temp" + File.separator;
		long now = System.currentTimeMillis();
		String picName = now + ".png";
		String fullPath = savePath + picName;
		try {
			Test.download("http://www.china-bid.com.cn/inc/verifycode.asp", picName, savePath);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// String[] _args = new String[3];
		// _args[0] = "/opt/local/bin/tesseract";
		// _args[1] = fullPath;
		// _args[2] = FileUtils.getTempDirectoryPath() + "CaptchaOcrResult";
		// String result = null;
		// try {
		// // Process exec = Runtime.getRuntime().exec(_args);
		// // exec.waitFor();
		// // result = FileUtils.readFileToString(new File(_args[2] + ".txt"));
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// // FileUtils.deleteQuietly(new File(_args[2] + ".txt"));
		// }
		// System.out.println(result);
		// try {
		// FileUtils.copyFile(new File(_args[1]), new File(savePath + now +
		// "copy.png"));
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// }
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(new File(fullPath));
			// bi = ImageIO.read(new
			// File("/Users/akimoto/Documents/OCR/HtmlUnitTest/temp/1404550685316.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		int height = bi.getHeight();
		int width = bi.getWidth();
		int minX = bi.getMinX();
		int minY = bi.getMinY();
		int[][] imageBytes = new int[height][width];
		for (int y = minY; y < height; y++) {
			for (int x = minX; x < width; x++) {
				int rgb = bi.getRGB(x, y);
				imageBytes[y][x] = rgb;
			}
		}

		// showImage(imageBytes);
		top(imageBytes);
		bottom(imageBytes);
		left(imageBytes);
		right(imageBytes);
		body(imageBytes);
		// showImage(imageBytes);

		int[][] part0 = getPart0(imageBytes);
		int[][] part1 = getPart1(imageBytes);
		int[][] part2 = getPart2(imageBytes);
		int[][] part3 = getPart3(imageBytes);

		int p0 = guess(part0);
		System.out.print(p0);
		int p1 = guess(part1);
		System.out.print(p1);
		int p2 = guess(part2);
		System.out.print(p2);
		int p3 = guess(part3);
		System.out.println(p3);
		// for (int y = minY; y < height; y++) {
		// for (int x = minX; x < width; x++) {
		// int rgb = bi.getRGB(x, y);
		// Color color = new Color(rgb); // 根据rgb的int值分别取得r,g,b颜色。
		// int gray = (int) (0.3 * color.getRed() + 0.59 * color.getGreen() +
		// 0.11 * color.getBlue());
		// Color newColor = new Color(gray, gray, gray);
		// bi.setRGB(x, y, newColor.getRGB());
		// }
		// }
		// bi.flush();
		// for (int y = minY; y < height; y++) {
		// for (int x = minX; x < width; x++) {
		// int rgb = bi.getRGB(x, y);
		// Color color = new Color(rgb); // 根据rgb的int值分别取得r,g,b颜色。
		// Color newColor = new Color(255 - color.getRed(), 255 -
		// color.getGreen(), 255 - color.getBlue());
		// bi.setRGB(x, y, newColor.getRGB());
		// }
		// }

		for (int y = minY; y < height; y++) {
			for (int x = minX; x < width; x++) {
				bi.setRGB(x, y, imageBytes[y][x]);
			}
		}
		ImageFilter _if = new ImageFilter(bi);
		bi = _if.scale((float) 200.0);

		try {
			ImageIO.write(bi, "png", new File(savePath + "change" + now + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int guess(int[][] part) {
		float max = 0;
		int target = -1;
		int count = 0;
		for (int[][] is : list) {
			float similarity = getSimilarity(is, part);
			// System.out.println(similarity);
			if (similarity > max) {
				max = similarity;
				target = count;
			}
			count++;
		}

		return target;
	}

	private static float getSimilarity(int[][] is, int[][] part) {
		int count = 0;
		int total = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (is[i][j] == part[i][j] && is[i][j] == RED)
					count++;
				if (is[i][j] == RED)
					total++;
			}
		}
		return (float) (count) / (float) (total);
	}

	private static int[][] getPart3(int[][] imageBytes) {
		int[][] s = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				s[i][j] = imageBytes[i][j + 30];
			}
		}
		return s;
	}

	private static int[][] getPart2(int[][] imageBytes) {
		int[][] s = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				s[i][j] = imageBytes[i][j + 20];
			}
		}
		return s;
	}

	private static int[][] getPart1(int[][] imageBytes) {
		int[][] s = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				s[i][j] = imageBytes[i][j + 10];
			}
		}
		return s;
	}

	private static int[][] getPart0(int[][] imageBytes) {
		int[][] s = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				s[i][j] = imageBytes[i][j];
			}
		}
		return s;
	}

	private static void body(int[][] im) {
		// TODO Auto-generated method stub
		for (int i = 1; i < im.length - 1; i++) {
			for (int j = 1; j < im[i].length - 1; j++) {
				int count = 0;
				if (im[i][j] == WHITE)
					continue;
				if (im[i - 1][j] == WHITE)
					count++;
				if (im[i + 1][j] == WHITE)
					count++;
				if (im[i][j - 1] == WHITE)
					count++;
				if (im[i][j + 1] == WHITE)
					count++;
				if (im[i + 1][j - 1] == WHITE)
					count++;
				if (count == 5)
					im[i][j] = WHITE;
			}
		}
	}

	public static void right(int[][] im) {
		// TODO Auto-generated method stub
		int l = im.length;
		for (int i = 1; i < l - 1; i++) {
			int w = im[i].length - 1;
			if (im[i][w] == WHITE)
				continue;
			int count = 0;
			if (im[i - 1][w] == WHITE)
				count++;
			if (im[i + 1][w] == WHITE)
				count++;
			if (im[i][w - 1] == WHITE)
				count++;
			if (count == 3)
				im[i][w] = WHITE;
		}

	}

	public static void left(int[][] im) {
		// TODO Auto-generated method stub
		int l = im.length;
		for (int i = 1; i < l - 1; i++) {
			if (im[i][0] == WHITE)
				continue;
			int count = 0;
			if (im[i - 1][0] == WHITE)
				count++;
			if (im[i + 1][0] == WHITE)
				count++;
			if (im[i][1] == WHITE)
				count++;
			if (count == 3)
				im[i][0] = WHITE;
		}
	}

	public static void bottom(int[][] im) {
		// TODO Auto-generated method stub
		int[] is = im[im.length - 1];

		for (int i = 1; i < is.length - 1; i++) {
			if (is[i] == WHITE)
				continue;
			int count = 0;
			if (is[i - 1] == WHITE)
				count++;
			if (is[i + 1] == WHITE)
				count++;
			if (im[im.length - 2][i] == WHITE)
				count++;
			if (count == 3)
				is[i] = WHITE;
		}
	}

	public static void top(int[][] im) {
		// TODO Auto-generated method stub
		int[] is = im[0];

		for (int i = 1; i < is.length - 1; i++) {
			if (is[i] == WHITE)
				continue;
			int count = 0;
			if (is[i - 1] == WHITE)
				count++;
			if (is[i + 1] == WHITE)
				count++;
			if (im[1][i] == WHITE)
				count++;
			if (count == 3)
				is[i] = WHITE;
		}

	}

	public static void showImage(int[][] imageBytes) {
		System.out.println("------");
		System.out.println();
		for (int i = 0; i < imageBytes.length; i++) {
			int[] js = imageBytes[i];
			for (int j = 0; j < js.length; j++) {
				int t = js[j];
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}

}
