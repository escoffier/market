package com.server.model;

import com.model.Quote;

import java.util.ArrayList;
import java.util.List;

public class QuoteList {
    List<Quote> quoteList = new ArrayList<Quote>();

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    public QuoteList() {

    }
    public QuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    public void append(QuoteList other) { this.quoteList.addAll(other.getQuoteList());}
}
