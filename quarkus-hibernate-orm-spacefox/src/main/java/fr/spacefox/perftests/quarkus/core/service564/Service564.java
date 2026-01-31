package fr.spacefox.perftests.quarkus.core.service564;

import fr.spacefox.perftests.quarkus.core.port.data.Entity564DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service564.model.Model564;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service564 {

    private final Entity564DatasourcePort datasource;

    public Service564(Entity564DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model564 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
