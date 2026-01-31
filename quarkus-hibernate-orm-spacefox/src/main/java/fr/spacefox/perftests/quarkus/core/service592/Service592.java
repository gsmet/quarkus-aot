package fr.spacefox.perftests.quarkus.core.service592;

import fr.spacefox.perftests.quarkus.core.port.data.Entity592DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service592.model.Model592;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service592 {

    private final Entity592DatasourcePort datasource;

    public Service592(Entity592DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model592 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
