package CustomCode;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public String readdata(String key) {
		String filePath = "your_file.xlsx"; // Replace with the actual file path
        String searchKey = key; 
        String value = null;
		try (FileInputStream fis = new FileInputStream(new String(filePath))) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Reading the first sheet

            for (Row row : sheet) {
                Cell keyCell = row.getCell(0); // Assuming keys are in column A
                if (keyCell != null && searchKey.equals(keyCell.toString())) {
                    // Key matches, retrieve the corresponding value
                    Cell valueCell = row.getCell(1); // Assuming the value is in column B
                    if (valueCell != null) {
                       value = valueCell.toString();
                        System.out.println("Key: " + searchKey + ", Value: " + value);
                    } else {
                        System.out.println("No value found for the key: " + searchKey);
                    }
                    break;
                }
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return value;
		
	}
}
