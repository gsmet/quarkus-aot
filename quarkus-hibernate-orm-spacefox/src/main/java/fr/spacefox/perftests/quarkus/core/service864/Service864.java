package fr.spacefox.perftests.quarkus.core.service864;

import fr.spacefox.perftests.quarkus.core.port.data.Entity864DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service864.model.Model864;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service864 {

    private final Entity864DatasourcePort datasource;

    public Service864(Entity864DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model864 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
