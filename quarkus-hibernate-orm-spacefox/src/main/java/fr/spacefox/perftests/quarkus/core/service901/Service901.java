package fr.spacefox.perftests.quarkus.core.service901;

import fr.spacefox.perftests.quarkus.core.port.data.Entity901DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service901.model.Model901;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service901 {

    private final Entity901DatasourcePort datasource;

    public Service901(Entity901DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model901 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
