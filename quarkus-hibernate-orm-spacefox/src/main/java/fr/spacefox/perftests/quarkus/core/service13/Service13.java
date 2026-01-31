package fr.spacefox.perftests.quarkus.core.service13;

import fr.spacefox.perftests.quarkus.core.port.data.Entity13DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service13.model.Model13;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service13 {

    private final Entity13DatasourcePort datasource;

    public Service13(Entity13DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model13 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
