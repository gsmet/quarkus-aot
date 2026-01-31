package fr.spacefox.perftests.quarkus.core.service405;

import fr.spacefox.perftests.quarkus.core.port.data.Entity405DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service405.model.Model405;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service405 {

    private final Entity405DatasourcePort datasource;

    public Service405(Entity405DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model405 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
