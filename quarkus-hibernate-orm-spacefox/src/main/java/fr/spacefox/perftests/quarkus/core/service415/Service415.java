package fr.spacefox.perftests.quarkus.core.service415;

import fr.spacefox.perftests.quarkus.core.port.data.Entity415DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service415.model.Model415;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service415 {

    private final Entity415DatasourcePort datasource;

    public Service415(Entity415DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model415 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
