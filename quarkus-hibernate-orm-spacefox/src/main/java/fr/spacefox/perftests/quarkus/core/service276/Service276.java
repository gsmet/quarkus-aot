package fr.spacefox.perftests.quarkus.core.service276;

import fr.spacefox.perftests.quarkus.core.port.data.Entity276DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service276.model.Model276;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service276 {

    private final Entity276DatasourcePort datasource;

    public Service276(Entity276DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model276 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
