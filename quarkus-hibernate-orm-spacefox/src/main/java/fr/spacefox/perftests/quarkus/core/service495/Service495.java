package fr.spacefox.perftests.quarkus.core.service495;

import fr.spacefox.perftests.quarkus.core.port.data.Entity495DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service495.model.Model495;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service495 {

    private final Entity495DatasourcePort datasource;

    public Service495(Entity495DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model495 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
