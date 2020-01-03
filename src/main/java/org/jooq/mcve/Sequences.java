/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve;


import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in mcve
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>mcve.issue_9679_id_seq</code>
     */
    public static final Sequence<Integer> ISSUE_9679_ID_SEQ = new SequenceImpl<Integer>("issue_9679_id_seq", Mcve.MCVE, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
