/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve;


import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.mcve.tables.FlywaySchemaHistory;
import org.jooq.mcve.tables.Issue_9679;
import org.jooq.mcve.tables.records.FlywaySchemaHistoryRecord;
import org.jooq.mcve.tables.records.Issue_9679Record;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>mcve</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<Issue_9679Record, Integer> IDENTITY_ISSUE_9679 = Identities0.IDENTITY_ISSUE_9679;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<Issue_9679Record> ISSUE_9679_PKEY = UniqueKeys0.ISSUE_9679_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<Issue_9679Record, Integer> IDENTITY_ISSUE_9679 = Internal.createIdentity(Issue_9679.ISSUE_9679, Issue_9679.ISSUE_9679.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<Issue_9679Record> ISSUE_9679_PKEY = Internal.createUniqueKey(Issue_9679.ISSUE_9679, "issue_9679_pkey", Issue_9679.ISSUE_9679.ID);
    }
}