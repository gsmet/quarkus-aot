package fr.spacefox.perftests.quarkus.core.service153;

import fr.spacefox.perftests.quarkus.core.port.data.Entity153DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service153.model.Model153;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service153 {

    private final Entity153DatasourcePort datasource;

    public Service153(Entity153DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model153 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
