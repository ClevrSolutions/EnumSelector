// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

public class Color
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject colorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestSuite.Color";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		RAL("RAL"),
		IsPrimary("IsPrimary"),
		ColorCode("ColorCode");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Color(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestSuite.Color"));
	}

	protected Color(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject colorMendixObject)
	{
		if (colorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestSuite.Color", colorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestSuite.Color");

		this.colorMendixObject = colorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Color.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testsuite.proxies.Color initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testsuite.proxies.Color.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.Color initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testsuite.proxies.Color(context, mendixObject);
	}

	public static testsuite.proxies.Color load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.Color.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of RAL
	 */
	public final java.lang.Integer getRAL()
	{
		return getRAL(getContext());
	}

	/**
	 * @param context
	 * @return value of RAL
	 */
	public final java.lang.Integer getRAL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RAL.toString());
	}

	/**
	 * Set value of RAL
	 * @param ral
	 */
	public final void setRAL(java.lang.Integer ral)
	{
		setRAL(getContext(), ral);
	}

	/**
	 * Set value of RAL
	 * @param context
	 * @param ral
	 */
	public final void setRAL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ral)
	{
		getMendixObject().setValue(context, MemberNames.RAL.toString(), ral);
	}

	/**
	 * @return value of IsPrimary
	 */
	public final java.lang.Boolean getIsPrimary()
	{
		return getIsPrimary(getContext());
	}

	/**
	 * @param context
	 * @return value of IsPrimary
	 */
	public final java.lang.Boolean getIsPrimary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsPrimary.toString());
	}

	/**
	 * Set value of IsPrimary
	 * @param isprimary
	 */
	public final void setIsPrimary(java.lang.Boolean isprimary)
	{
		setIsPrimary(getContext(), isprimary);
	}

	/**
	 * Set value of IsPrimary
	 * @param context
	 * @param isprimary
	 */
	public final void setIsPrimary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isprimary)
	{
		getMendixObject().setValue(context, MemberNames.IsPrimary.toString(), isprimary);
	}

	/**
	 * @return value of ColorCode
	 */
	public final java.lang.String getColorCode()
	{
		return getColorCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ColorCode
	 */
	public final java.lang.String getColorCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ColorCode.toString());
	}

	/**
	 * Set value of ColorCode
	 * @param colorcode
	 */
	public final void setColorCode(java.lang.String colorcode)
	{
		setColorCode(getContext(), colorcode);
	}

	/**
	 * Set value of ColorCode
	 * @param context
	 * @param colorcode
	 */
	public final void setColorCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String colorcode)
	{
		getMendixObject().setValue(context, MemberNames.ColorCode.toString(), colorcode);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return colorMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testsuite.proxies.Color that = (testsuite.proxies.Color) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestSuite.Color";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}