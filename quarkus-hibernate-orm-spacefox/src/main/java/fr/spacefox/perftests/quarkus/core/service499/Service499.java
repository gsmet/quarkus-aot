package fr.spacefox.perftests.quarkus.core.service499;

import fr.spacefox.perftests.quarkus.core.port.data.Entity499DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service499.model.Model499;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service499 {

    private final Entity499DatasourcePort datasource;

    public Service499(Entity499DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model499 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
