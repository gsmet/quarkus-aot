package fr.spacefox.perftests.quarkus.core.service870;

import fr.spacefox.perftests.quarkus.core.port.data.Entity870DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service870.model.Model870;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service870 {

    private final Entity870DatasourcePort datasource;

    public Service870(Entity870DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model870 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
