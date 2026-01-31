package fr.spacefox.perftests.quarkus.core.service3;

import fr.spacefox.perftests.quarkus.core.port.data.Entity3DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service3.model.Model3;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service3 {

    private final Entity3DatasourcePort datasource;

    public Service3(Entity3DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model3 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
