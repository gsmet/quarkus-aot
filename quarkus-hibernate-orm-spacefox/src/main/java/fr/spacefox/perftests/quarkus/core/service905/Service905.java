package fr.spacefox.perftests.quarkus.core.service905;

import fr.spacefox.perftests.quarkus.core.port.data.Entity905DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service905.model.Model905;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service905 {

    private final Entity905DatasourcePort datasource;

    public Service905(Entity905DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model905 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
