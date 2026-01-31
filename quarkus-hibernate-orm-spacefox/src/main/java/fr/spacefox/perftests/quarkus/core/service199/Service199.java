package fr.spacefox.perftests.quarkus.core.service199;

import fr.spacefox.perftests.quarkus.core.port.data.Entity199DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service199.model.Model199;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service199 {

    private final Entity199DatasourcePort datasource;

    public Service199(Entity199DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model199 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
