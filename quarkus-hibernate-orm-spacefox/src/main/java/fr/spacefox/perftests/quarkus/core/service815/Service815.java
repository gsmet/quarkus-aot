package fr.spacefox.perftests.quarkus.core.service815;

import fr.spacefox.perftests.quarkus.core.port.data.Entity815DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service815.model.Model815;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service815 {

    private final Entity815DatasourcePort datasource;

    public Service815(Entity815DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model815 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
