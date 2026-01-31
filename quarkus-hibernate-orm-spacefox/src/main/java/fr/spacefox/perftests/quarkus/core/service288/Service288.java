package fr.spacefox.perftests.quarkus.core.service288;

import fr.spacefox.perftests.quarkus.core.port.data.Entity288DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service288.model.Model288;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service288 {

    private final Entity288DatasourcePort datasource;

    public Service288(Entity288DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model288 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
