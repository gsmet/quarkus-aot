package fr.spacefox.perftests.quarkus.core.service161;

import fr.spacefox.perftests.quarkus.core.port.data.Entity161DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service161.model.Model161;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service161 {

    private final Entity161DatasourcePort datasource;

    public Service161(Entity161DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model161 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
