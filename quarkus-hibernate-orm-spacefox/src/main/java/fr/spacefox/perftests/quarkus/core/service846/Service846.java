package fr.spacefox.perftests.quarkus.core.service846;

import fr.spacefox.perftests.quarkus.core.port.data.Entity846DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service846.model.Model846;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service846 {

    private final Entity846DatasourcePort datasource;

    public Service846(Entity846DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model846 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
