package fr.spacefox.perftests.quarkus.core.service486;

import fr.spacefox.perftests.quarkus.core.port.data.Entity486DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service486.model.Model486;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service486 {

    private final Entity486DatasourcePort datasource;

    public Service486(Entity486DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model486 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
