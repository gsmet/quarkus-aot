package fr.spacefox.perftests.quarkus.core.service986;

import fr.spacefox.perftests.quarkus.core.port.data.Entity986DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service986.model.Model986;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service986 {

    private final Entity986DatasourcePort datasource;

    public Service986(Entity986DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model986 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
