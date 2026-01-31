package fr.spacefox.perftests.quarkus.core.service577;

import fr.spacefox.perftests.quarkus.core.port.data.Entity577DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service577.model.Model577;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service577 {

    private final Entity577DatasourcePort datasource;

    public Service577(Entity577DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model577 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
