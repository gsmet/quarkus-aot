package fr.spacefox.perftests.quarkus.core.service470;

import fr.spacefox.perftests.quarkus.core.port.data.Entity470DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service470.model.Model470;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service470 {

    private final Entity470DatasourcePort datasource;

    public Service470(Entity470DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model470 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
