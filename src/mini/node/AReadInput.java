/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import mini.analysis.*;

@SuppressWarnings("nls")
public final class AReadInput extends PInput
{
    private TRead _read_;
    private TId _id_;
    private TSemi _semi_;

    public AReadInput()
    {
        // Constructor
    }

    public AReadInput(
        @SuppressWarnings("hiding") TRead _read_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setRead(_read_);

        setId(_id_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new AReadInput(
            cloneNode(this._read_),
            cloneNode(this._id_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReadInput(this);
    }

    public TRead getRead()
    {
        return this._read_;
    }

    public void setRead(TRead node)
    {
        if(this._read_ != null)
        {
            this._read_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._read_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._read_)
            + toString(this._id_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._read_ == child)
        {
            this._read_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._read_ == oldChild)
        {
            setRead((TRead) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}