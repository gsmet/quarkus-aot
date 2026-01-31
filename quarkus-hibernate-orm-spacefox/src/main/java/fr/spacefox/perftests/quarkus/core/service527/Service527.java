package fr.spacefox.perftests.quarkus.core.service527;

import fr.spacefox.perftests.quarkus.core.port.data.Entity527DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service527.model.Model527;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service527 {

    private final Entity527DatasourcePort datasource;

    public Service527(Entity527DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model527 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
