package fr.spacefox.perftests.quarkus.core.service597;

import fr.spacefox.perftests.quarkus.core.port.data.Entity597DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service597.model.Model597;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service597 {

    private final Entity597DatasourcePort datasource;

    public Service597(Entity597DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model597 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
