package fr.spacefox.perftests.quarkus.core.service806;

import fr.spacefox.perftests.quarkus.core.port.data.Entity806DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service806.model.Model806;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service806 {

    private final Entity806DatasourcePort datasource;

    public Service806(Entity806DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model806 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
