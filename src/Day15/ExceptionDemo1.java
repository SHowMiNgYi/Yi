package Day15;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        String str;
//		try {
//			// 可能出现异常的代码
//			str = readTxt("D:a.avi");
//		} catch (PathNotExistException e) {
//			// TODO Auto-generated catch block
//			// 打印栈轨迹
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}catch(FileFormatException e){
//			System.out.println(e.getMessage());
//		}

//		try {
//			// 可能出现异常的代码
//			str = readTxt("D:a.avi");
//		} catch (Exception e) {
//			// 打印栈轨迹
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}

        try {
            // 可能出现异常的代码
            str = readTxt("D:a.avi");
        } catch (FileFormatException | PathNotExistException e) {
            // 打印栈轨迹
            System.out.println(e.getMessage());
//			e.printStackTrace();
        }

//		try {
//			// 可能出现异常的代码
//			str = readTxt("D:a.avi");
//		}catch(Exception e){
//
//		}catch (FileFormatException e) {// 这个异常永远不能被执行
//			// 打印栈轨迹
//			// 异常捕获时，前面的catch中的异常不能是后面catch中异常的父类
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}

        System.out.println("代码继续执行了吗？");
    }
//	public static void demo() throws PathNotExistException{
//		readTxt("");
//	}

    // 代表去某一个文件夹中读取一个文本信息
    public static String readTxt(String path)throws PathNotExistException, FileFormatException{
        if (path == null){
            throw new NullPointerException("空指针异常");
        }

        if (path.startsWith("P:")){
            // 抛出路径不存在异常
            throw new PathNotExistException("路径不存在！检查你写的路径！");
        }

        if (path.endsWith(".avi")){
            throw new FileFormatException("文件格式异常");
        }


        return "读取文本成功啦~";
    }
}

class FileFormatException extends Exception{


    public FileFormatException(){

    }

    public FileFormatException(String message){
        super(message);
    }


}

// 自定义异常
class PathNotExistException extends Exception{

    public PathNotExistException(){

    }

    public PathNotExistException(String message){
        super(message);
    }
    }
