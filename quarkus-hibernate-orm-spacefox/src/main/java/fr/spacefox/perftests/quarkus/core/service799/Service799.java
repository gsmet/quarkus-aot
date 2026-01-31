package fr.spacefox.perftests.quarkus.core.service799;

import fr.spacefox.perftests.quarkus.core.port.data.Entity799DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service799.model.Model799;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service799 {

    private final Entity799DatasourcePort datasource;

    public Service799(Entity799DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model799 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
