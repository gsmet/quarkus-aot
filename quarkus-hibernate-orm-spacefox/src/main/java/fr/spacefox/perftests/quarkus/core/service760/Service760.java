package fr.spacefox.perftests.quarkus.core.service760;

import fr.spacefox.perftests.quarkus.core.port.data.Entity760DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service760.model.Model760;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service760 {

    private final Entity760DatasourcePort datasource;

    public Service760(Entity760DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model760 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
