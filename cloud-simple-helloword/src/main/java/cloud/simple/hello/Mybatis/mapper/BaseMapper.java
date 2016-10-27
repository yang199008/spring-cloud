/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cloud.simple.hello.Mybatis.mapper;

import cloud.simple.hello.common.PageBean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 继承该接口后，无需编写 mapper.xml 文件，即可获得CRUD功能
 * </p>
 * <p>
 * 这个 Mapper 支持 id 泛型
 * </p>
 * 
 * @author hubin
 * @Date 2016-01-23
 */
public interface BaseMapper<T, PK extends Serializable> {

	int insert(T var1);

	int update(T var1);

	int insert(Map<String, Object> map);

	int update(Map<String, Object> map);

	void insertBatch(List<T> var1);


	int delete(Serializable var1);

	int remove(Serializable var1);

	int count(Map<String, Object> var1);

	List<T> findAll();

	List<T> findAll(Object var1);

	List<T> findAll(Map<String, Object> var1);

	List<T> findPageInfo(int[] var1, Serializable var2);

	List<T> findPageInfo(int[] var1, Map<String, Object> var2, Object... var3);

	List<T> findPageInfo(int[] var1, Map<String, Object> var2);

	T findByNamedParam(Map<String, Object> var1);

	List<T> findByNamedParamList(Map<String, Object> var1);

	T findByNamedParam(Serializable var1);

	List<T> findByNamedParamList(Serializable var1);

	T selectByPrimaryKey(Serializable var1);
	List<Serializable> getIds(List<?> tmplist, String propertyName);

	PageBean<T> findPageBean(int var1, int var2, Map<String, Object> var3);

	PageBean<T> findPageBean(int var1, int var2, Map<String, Object> var3, String var4, String var5);

}
