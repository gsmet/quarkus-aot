package fr.spacefox.perftests.quarkus.core.service193;

import fr.spacefox.perftests.quarkus.core.port.data.Entity193DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service193.model.Model193;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service193 {

    private final Entity193DatasourcePort datasource;

    public Service193(Entity193DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model193 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
