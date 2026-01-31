package fr.spacefox.perftests.quarkus.core.service167;

import fr.spacefox.perftests.quarkus.core.port.data.Entity167DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service167.model.Model167;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service167 {

    private final Entity167DatasourcePort datasource;

    public Service167(Entity167DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model167 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
