package fr.spacefox.perftests.quarkus.core.service575;

import fr.spacefox.perftests.quarkus.core.port.data.Entity575DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service575.model.Model575;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service575 {

    private final Entity575DatasourcePort datasource;

    public Service575(Entity575DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model575 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
