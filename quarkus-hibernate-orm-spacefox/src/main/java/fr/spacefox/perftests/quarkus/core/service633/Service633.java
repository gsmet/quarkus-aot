package fr.spacefox.perftests.quarkus.core.service633;

import fr.spacefox.perftests.quarkus.core.port.data.Entity633DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service633.model.Model633;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service633 {

    private final Entity633DatasourcePort datasource;

    public Service633(Entity633DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model633 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
