package fr.spacefox.perftests.quarkus.core.service227;

import fr.spacefox.perftests.quarkus.core.port.data.Entity227DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service227.model.Model227;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service227 {

    private final Entity227DatasourcePort datasource;

    public Service227(Entity227DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model227 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
