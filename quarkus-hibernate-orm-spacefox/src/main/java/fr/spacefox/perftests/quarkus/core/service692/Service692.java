package fr.spacefox.perftests.quarkus.core.service692;

import fr.spacefox.perftests.quarkus.core.port.data.Entity692DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service692.model.Model692;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service692 {

    private final Entity692DatasourcePort datasource;

    public Service692(Entity692DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model692 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
