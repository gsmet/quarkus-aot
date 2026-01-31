package fr.spacefox.perftests.quarkus.core.service433;

import fr.spacefox.perftests.quarkus.core.port.data.Entity433DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service433.model.Model433;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service433 {

    private final Entity433DatasourcePort datasource;

    public Service433(Entity433DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model433 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
