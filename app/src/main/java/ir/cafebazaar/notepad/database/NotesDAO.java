package ir.cafebazaar.notepad.database;

import com.raizlabs.android.dbflow.sql.language.SQLite;
import ir.cafebazaar.notepad.models.Folder;
import ir.cafebazaar.notepad.models.Note;
import ir.cafebazaar.notepad.models.Note_Table;
import java.util.List;

/**
 * Created by MohMah on 8/21/2016.
 */
public class NotesDAO{
	public static List<Note> getLatestNotes(Folder folder){
		if (folder == null)
			return SQLite.select().from(Note.class).orderBy(Note_Table.lastModified, false).queryList();
		else
			return FolderNoteDAO.getLatestNotes(folder);
	}
}