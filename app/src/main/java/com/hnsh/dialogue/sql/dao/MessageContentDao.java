package com.hnsh.dialogue.sql.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.hnsh.dialogue.bean.cbs.MessageContent;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "MESSAGE_CONTENT".
*/
public class MessageContentDao extends AbstractDao<MessageContent, Long> {

    public static final String TABLENAME = "MESSAGE_CONTENT";

    /**
     * Properties of entity MessageContent.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Quid = new Property(1, String.class, "quid", false, "QUID");
        public final static Property Session = new Property(2, int.class, "session", false, "SESSION");
        public final static Property State = new Property(3, int.class, "state", false, "STATE");
        public final static Property Portrait = new Property(4, String.class, "portrait", false, "PORTRAIT");
        public final static Property NickName = new Property(5, String.class, "nickName", false, "NICK_NAME");
        public final static Property Content = new Property(6, String.class, "content", false, "CONTENT");
        public final static Property SendTimeMs = new Property(7, long.class, "sendTimeMs", false, "SEND_TIME_MS");
        public final static Property LangId = new Property(8, int.class, "langId", false, "LANG_ID");
        public final static Property MsgType = new Property(9, int.class, "msgType", false, "MSG_TYPE");
        public final static Property IsPlaying = new Property(10, boolean.class, "isPlaying", false, "IS_PLAYING");
        public final static Property Mid = new Property(11, String.class, "mid", false, "MID");
        public final static Property TargetText = new Property(12, String.class, "targetText", false, "TARGET_TEXT");
        public final static Property IsSynthesyed = new Property(13, boolean.class, "isSynthesyed", false, "IS_SYNTHESYED");
    }


    public MessageContentDao(DaoConfig config) {
        super(config);
    }
    
    public MessageContentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MESSAGE_CONTENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"QUID\" TEXT," + // 1: quid
                "\"SESSION\" INTEGER NOT NULL ," + // 2: session
                "\"STATE\" INTEGER NOT NULL ," + // 3: state
                "\"PORTRAIT\" TEXT," + // 4: portrait
                "\"NICK_NAME\" TEXT," + // 5: nickName
                "\"CONTENT\" TEXT," + // 6: content
                "\"SEND_TIME_MS\" INTEGER NOT NULL UNIQUE ," + // 7: sendTimeMs
                "\"LANG_ID\" INTEGER NOT NULL ," + // 8: langId
                "\"MSG_TYPE\" INTEGER NOT NULL ," + // 9: msgType
                "\"IS_PLAYING\" INTEGER NOT NULL ," + // 10: isPlaying
                "\"MID\" TEXT," + // 11: mid
                "\"TARGET_TEXT\" TEXT," + // 12: targetText
                "\"IS_SYNTHESYED\" INTEGER NOT NULL );"); // 13: isSynthesyed
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MESSAGE_CONTENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MessageContent entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String quid = entity.getQuid();
        if (quid != null) {
            stmt.bindString(2, quid);
        }
        stmt.bindLong(3, entity.getSession());
        stmt.bindLong(4, entity.getState());
 
        String portrait = entity.getPortrait();
        if (portrait != null) {
            stmt.bindString(5, portrait);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(6, nickName);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
        stmt.bindLong(8, entity.getSendTimeMs());
        stmt.bindLong(9, entity.getLangId());
        stmt.bindLong(10, entity.getMsgType());
        stmt.bindLong(11, entity.getIsPlaying() ? 1L: 0L);
 
        String mid = entity.getMid();
        if (mid != null) {
            stmt.bindString(12, mid);
        }
 
        String targetText = entity.getTargetText();
        if (targetText != null) {
            stmt.bindString(13, targetText);
        }
        stmt.bindLong(14, entity.getIsSynthesyed() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MessageContent entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String quid = entity.getQuid();
        if (quid != null) {
            stmt.bindString(2, quid);
        }
        stmt.bindLong(3, entity.getSession());
        stmt.bindLong(4, entity.getState());
 
        String portrait = entity.getPortrait();
        if (portrait != null) {
            stmt.bindString(5, portrait);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(6, nickName);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
        stmt.bindLong(8, entity.getSendTimeMs());
        stmt.bindLong(9, entity.getLangId());
        stmt.bindLong(10, entity.getMsgType());
        stmt.bindLong(11, entity.getIsPlaying() ? 1L: 0L);
 
        String mid = entity.getMid();
        if (mid != null) {
            stmt.bindString(12, mid);
        }
 
        String targetText = entity.getTargetText();
        if (targetText != null) {
            stmt.bindString(13, targetText);
        }
        stmt.bindLong(14, entity.getIsSynthesyed() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MessageContent readEntity(Cursor cursor, int offset) {
        MessageContent entity = new MessageContent( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // quid
            cursor.getInt(offset + 2), // session
            cursor.getInt(offset + 3), // state
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // portrait
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // nickName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // content
            cursor.getLong(offset + 7), // sendTimeMs
            cursor.getInt(offset + 8), // langId
            cursor.getInt(offset + 9), // msgType
            cursor.getShort(offset + 10) != 0, // isPlaying
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // mid
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // targetText
            cursor.getShort(offset + 13) != 0 // isSynthesyed
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MessageContent entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setQuid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSession(cursor.getInt(offset + 2));
        entity.setState(cursor.getInt(offset + 3));
        entity.setPortrait(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNickName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContent(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSendTimeMs(cursor.getLong(offset + 7));
        entity.setLangId(cursor.getInt(offset + 8));
        entity.setMsgType(cursor.getInt(offset + 9));
        entity.setIsPlaying(cursor.getShort(offset + 10) != 0);
        entity.setMid(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setTargetText(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setIsSynthesyed(cursor.getShort(offset + 13) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MessageContent entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MessageContent entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MessageContent entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
