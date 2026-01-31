package fr.spacefox.perftests.quarkus.core.service608;

import fr.spacefox.perftests.quarkus.core.port.data.Entity608DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service608.model.Model608;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service608 {

    private final Entity608DatasourcePort datasource;

    public Service608(Entity608DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model608 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
