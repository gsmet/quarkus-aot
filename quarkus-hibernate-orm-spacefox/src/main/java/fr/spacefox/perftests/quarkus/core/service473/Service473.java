package fr.spacefox.perftests.quarkus.core.service473;

import fr.spacefox.perftests.quarkus.core.port.data.Entity473DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service473.model.Model473;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service473 {

    private final Entity473DatasourcePort datasource;

    public Service473(Entity473DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model473 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
