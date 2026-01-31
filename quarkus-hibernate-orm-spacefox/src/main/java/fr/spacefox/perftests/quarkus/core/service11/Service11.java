package fr.spacefox.perftests.quarkus.core.service11;

import fr.spacefox.perftests.quarkus.core.port.data.Entity11DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service11.model.Model11;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service11 {

    private final Entity11DatasourcePort datasource;

    public Service11(Entity11DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model11 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
