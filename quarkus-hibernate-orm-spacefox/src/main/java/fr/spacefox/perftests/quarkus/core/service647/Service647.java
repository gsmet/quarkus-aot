package fr.spacefox.perftests.quarkus.core.service647;

import fr.spacefox.perftests.quarkus.core.port.data.Entity647DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service647.model.Model647;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service647 {

    private final Entity647DatasourcePort datasource;

    public Service647(Entity647DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model647 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
