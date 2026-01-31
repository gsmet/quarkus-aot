package fr.spacefox.perftests.quarkus.core.service580;

import fr.spacefox.perftests.quarkus.core.port.data.Entity580DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service580.model.Model580;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service580 {

    private final Entity580DatasourcePort datasource;

    public Service580(Entity580DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model580 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
