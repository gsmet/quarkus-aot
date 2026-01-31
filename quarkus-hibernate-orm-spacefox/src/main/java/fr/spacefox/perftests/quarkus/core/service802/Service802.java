package fr.spacefox.perftests.quarkus.core.service802;

import fr.spacefox.perftests.quarkus.core.port.data.Entity802DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service802.model.Model802;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service802 {

    private final Entity802DatasourcePort datasource;

    public Service802(Entity802DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model802 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
