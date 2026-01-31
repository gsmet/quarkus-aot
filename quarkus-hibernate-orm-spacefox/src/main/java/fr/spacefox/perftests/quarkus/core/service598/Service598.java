package fr.spacefox.perftests.quarkus.core.service598;

import fr.spacefox.perftests.quarkus.core.port.data.Entity598DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service598.model.Model598;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service598 {

    private final Entity598DatasourcePort datasource;

    public Service598(Entity598DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model598 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
