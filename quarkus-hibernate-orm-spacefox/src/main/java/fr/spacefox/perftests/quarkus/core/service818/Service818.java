package fr.spacefox.perftests.quarkus.core.service818;

import fr.spacefox.perftests.quarkus.core.port.data.Entity818DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service818.model.Model818;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service818 {

    private final Entity818DatasourcePort datasource;

    public Service818(Entity818DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model818 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
